package za.ac.cput.classcommunicator.factory;

import za.ac.cput.classcommunicator.domain.Classroom;
import za.ac.cput.classcommunicator.domain.Resource;

public class ResourceFactory {

    public static Resource createResource(
            String id,
            Classroom classroom,
            String resource_type,
            String resource_link,
            String resource_description) {

        return Resource.builder()
                .id(id)
                .classroom(classroom)
                .resource_type(resource_type)
                .resource_link(resource_link)
                .resource_description(resource_description)
                .build();
    }
}
