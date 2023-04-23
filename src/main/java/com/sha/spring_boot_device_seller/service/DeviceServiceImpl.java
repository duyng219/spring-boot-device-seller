package com.sha.spring_boot_device_seller.service;

import com.sha.spring_boot_device_seller.model.Device;
import com.sha.spring_boot_device_seller.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class DeviceServiceImpl implements DeviceService
{
    @Autowired
    private DeviceRepository deviceRepository;

    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    @Override
    public Device saveDevice(Device device)
    {
        device.setCreateTime(LocalDateTime.now());

        return deviceRepository.save(device);
    }

    @Override
    public void deleteDevice(Long id)
    {
        deviceRepository.deleteById(id);
    }

    @Override
    public List<Device> findAllDevices()
    {
        return deviceRepository.findAll();
    }
}
