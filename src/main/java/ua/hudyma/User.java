package ua.hudyma;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.Data;

@DynamoDBTable(tableName = "userDB")
@Data
public class User {
    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    private String id;

    @DynamoDBAttribute (attributeName = "email")
    private String email;
}
