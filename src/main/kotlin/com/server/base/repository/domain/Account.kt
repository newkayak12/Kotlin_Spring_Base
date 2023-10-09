package com.server.base.repository.domain

import com.server.base.components.enums.Role
import lombok.Getter
import lombok.NoArgsConstructor
import org.hibernate.annotations.Cache
import org.hibernate.annotations.CacheConcurrencyStrategy
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import java.time.LocalDateTime
import javax.persistence.*

@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "account")
@Entity
@DynamicInsert
@DynamicUpdate
class Account(): java.io.Serializable {

    @Id
    @Column(name = "userNo", columnDefinition = "BIGINT(20)")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val userNo: Long? = null

    @Column(name = "userId", columnDefinition = "VARCHAR (100)")
    private val userId: String? = null

    @Column(name = "userPwd", columnDefinition = "VARCHAR (500)")
    private val userPwd: String? = null

    @Column(name = "regDate", columnDefinition = "DATETIME default CURRENT_TIMESTAMP()")
    private var regDate: LocalDateTime? = null

    @Column(name = "lastSignDate", columnDefinition = "DATETIME")
    private var lastSignDate: LocalDateTime? = null

    @Column(name = "role", columnDefinition = "VARCHAR( 32 )")
    @Enumerated(value = EnumType.STRING)
    private val role: Role? = null

    @Column(name = "refreshToken", columnDefinition = "VARCHAR(1024)")
    private val refreshToken: String? = null



    @PostLoad
    fun renewSignDate() {
        lastSignDate = LocalDateTime.now()
    }

    @PrePersist
    fun signUpDate() {
        regDate = LocalDateTime.now()
    }
}