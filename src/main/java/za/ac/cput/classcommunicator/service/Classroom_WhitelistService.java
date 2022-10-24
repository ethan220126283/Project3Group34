package za.ac.cput.classcommunicator.service;

import za.ac.cput.classcommunicator.domain.Classroom_Whitelist;

import java.util.List;

public interface Classroom_WhitelistService extends IService<Classroom_Whitelist, String> {

    public List<Classroom_Whitelist> getAll();

}
