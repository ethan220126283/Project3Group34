package za.ac.cput.classcommunicator.service;

import za.ac.cput.classcommunicator.domain.Resource;
import za.ac.cput.classcommunicator.service.IService;

import java.util.List;

public interface ResourceService extends IService<Resource, String> {

    public List<Resource> getAll();

}
