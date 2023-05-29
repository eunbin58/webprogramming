package com.codingrecipe.board.entity;

import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;
//시간에 관한 클래스
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public class BaseEntity {
    @CreationTimestamp
    @Column(updatable = false) //수정시에는 이건 관여안하게
    private LocalDateTime createdTime;
    //생성됐을때 시간

    @UpdateTimestamp
    @Column(insertable = false) //생성시에는 이건 관연안하게
    private LocalDateTime updatedTime;
}
