package it.apulia.service;

import it.apulia.model.Brano;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

public interface BranoService {
    Brano saveBrano(Brano brano);

    List<Brano> getAllBrani();
    Brano getBranoById(String id);
    List<Brano> getBranoByData(int AnnoUscita );

    void updateBrano(Brano brano);
    void deleteBrano(Long branoId);


}
