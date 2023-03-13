package com.pods.fclabs.models;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

@MappedSuperclass
@Data
public abstract class EntidadeComEnderecoEAuditoriaAbstrata {
    @ApiModelProperty(hidden = true)
    @Column(name = "dt_criacao", updatable = false)
    private Date dtCriacao;
    @ApiModelProperty(hidden = true)
    private Date dtUltAlteracao;
    @ApiModelProperty(dataType = "Endereco")
    @OneToOne(orphanRemoval = true, fetch = FetchType.LAZY)
    private Endereco endereco;

    public abstract UUID getId();
}
