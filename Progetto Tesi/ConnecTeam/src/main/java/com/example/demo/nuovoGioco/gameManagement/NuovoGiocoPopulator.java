package com.example.demo.nuovoGioco.gameManagement;

import com.example.demo.nuovoGioco.gameManagement.database.ItemNuovoGioco;
import com.example.demo.nuovoGioco.gameManagement.database.ItemRepositoryNuovoGioco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class NuovoGiocoPopulator {

 @Autowired
 private ItemRepositoryNuovoGioco itemRepositoryNuovoGioco;

 @EventListener
 public void onApplicationEvent(ContextRefreshedEvent event) {

  ItemNuovoGioco item1= new ItemNuovoGioco();
  itemRepositoryNuovoGioco.save(item1);

 }
}
