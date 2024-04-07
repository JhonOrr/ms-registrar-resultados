package com.smartlab.msregistrarresultados.service;

import com.smartlab.msregistrarresultados.aggregates.dto.MuestraDto;
import com.smartlab.msregistrarresultados.aggregates.request.RequestMuestra;

public interface MuestraService {
    public MuestraDto registrarResultados(RequestMuestra requestMuestra, String username);
}
