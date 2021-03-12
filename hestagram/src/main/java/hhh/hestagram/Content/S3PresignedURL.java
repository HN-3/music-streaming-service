package hhh.hestagram.Content;

import com.amazonaws.HttpMethod;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.GeneratePresignedUrlRequest;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Date;

@Slf4j
@RequiredArgsConstructor // final 멤버변수가 있으면 생성자 항목에 포함시킴
@Component
@PropertySource("classpath:configure.properties")
public class S3PresignedURL {

    @Value("${cloud.aws.s3.bucket}")
    private String bucket;

    @Value("${cloud.aws.region.static}")
    private String region;

    @Value("${cloud.aws.credentials.accessKey}")
    private String accessKey;

    @Value("${cloud.aws.credentials.secretKey}")
    private String secretKey;

    public String getPreSignedURL(String dirName) throws IOException { //File uploadFile, String dirName
        String preSignedURL = "";
        //String fileName = dirName + "/" + "test"; //uploadFile.getName();

        BasicAWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);

        try {
            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                    .withCredentials(new AWSStaticCredentialsProvider(credentials)) //ew ProfileCredentialsProvider())
                    .withRegion(region)
                    .build();

            // Set the pre-signed URL to expire after one hour.
            java.util.Date expiration = new java.util.Date();
            long expTimeMillis = expiration.getTime();
            expTimeMillis += 1000 * 60 * 60;
            expiration.setTime(expTimeMillis);

            // Generate the pre-signed URL.
            //System.out.println("Generating pre-signed URL.");
            // key: 사진 이름
            GeneratePresignedUrlRequest generatePresignedUrlRequest = new GeneratePresignedUrlRequest(bucket, dirName+"/1")
                    .withMethod(HttpMethod.PUT)
                    .withExpiration(expiration);
            URL url = s3Client.generatePresignedUrl(generatePresignedUrlRequest);
            preSignedURL = url.toString();
            System.out.println("Pre-Signed URL : " + url.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }

        return preSignedURL;
    }
}
