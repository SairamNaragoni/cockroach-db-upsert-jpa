package com.rogue.cockroachdbupsert.service;

import com.rogue.cockroachdbupsert.models.User;
import com.rogue.cockroachdbupsert.repositories.UserRepository;
import com.rogue.cockroachdbupsert.util.MetricsLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class UserService {

    @Autowired
    UserRepository userRepository;

    @MetricsLogger
    public void upsert(){
        log.info("Upserting 1 record");
        User user = User.builder().id(UUID.randomUUID()).name("Rogue").city("Arkham").build();
        userRepository.upsert(user);
    }

    @MetricsLogger
    public void upsertAll(int numberOfRecords){
        log.info("Upserting {} records", numberOfRecords);
        List<User> users = new ArrayList<>();
        for(int i=0; i<numberOfRecords; i++){
            User user = User.builder().id(UUID.randomUUID()).name("Rogue").city("Arkham").build();
            users.add(user);
        }
        userRepository.upsertAll(users);
    }

    @MetricsLogger
    public void save(){
        log.info("Saving 1 record");
        User user = User.builder().id(UUID.randomUUID()).name("Rogue").city("Arkham").build();
        userRepository.save(user);
    }

    @MetricsLogger
    public void saveAll(int numberOfRecords){
        log.info("Saving {} records", numberOfRecords);
        List<User> users = new ArrayList<>();
        for(int i=0; i<numberOfRecords; i++){
            User user = User.builder().id(UUID.randomUUID()).name("Rogue").city("Arkham").build();
            users.add(user);
        }
        userRepository.saveAll(users);
    }

}
