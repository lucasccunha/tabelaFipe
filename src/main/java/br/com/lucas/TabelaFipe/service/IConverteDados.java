package br.com.lucas.TabelaFipe.service;

import java.util.List;

public interface IConverteDados {
    <T> T obterDados (String json, Class<T> classe);

    <T> List <T> ObterLista(String json, Class<T> classe);
}
