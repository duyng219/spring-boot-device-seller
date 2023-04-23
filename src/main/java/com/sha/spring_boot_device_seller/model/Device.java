package com.sha.spring_boot_device_seller.model;

import lombok.Data;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "devices")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "deviceType", nullable = false)
    private DeviceType deviceType;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "device")
    private Set<Purchase> purchaseList;
}
