package com.gsoy.brokagefirm.model.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Asset {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "customerId", nullable = false)
    @JdbcTypeCode(SqlTypes.INTEGER)
    private Integer customerId;
    private String assetName;
    private Integer size;
    private Integer usableSize;
}
