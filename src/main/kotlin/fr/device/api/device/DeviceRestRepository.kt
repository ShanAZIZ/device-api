package fr.device.api.device

import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "device", path = "device")
interface DeviceRestRepository: PagingAndSortingRepository<Device, Long>, CrudRepository<Device, Long> {
}