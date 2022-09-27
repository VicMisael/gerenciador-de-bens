package br.ufc.nuvem.patrimoniomanager.model;


import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "validation")
public class Validation {
    @DynamoDBHashKey(attributeName = "validationId")
    @DynamoDBAutoGeneratedKey
    String validationId;

    String idBem;
    String comentarios;
    Boolean aprovacao;
    Date date;
}
