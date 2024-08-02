package fr.device.api.device

import jakarta.persistence.*
import java.time.Instant

@Entity
data class Device(
    @Id @GeneratedValue(strategy = GenerationType.AUTO) var id: Long? = null,
    var name: String? = null,

    @Column(nullable = false)
    var buyingDate: Instant? = null,

    @Column(nullable = false)
    var buyingPrice: Double? = null,

    @Column(nullable = false)
    var annualEnergyConsumption: Double? = null,
)
