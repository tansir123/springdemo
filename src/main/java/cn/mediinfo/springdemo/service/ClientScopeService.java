package cn.mediinfo.springdemo.service;

import cn.mediinfo.springdemo.model.ClientscopeEntity;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClientScopeService {

    @Query("select id from ClientscopeEntity ")
    List<String> Get();

    List<ClientscopeEntity> GetById(String Id);

    List<ClientscopeEntity> GetPageable(int Page, int Size);
}
