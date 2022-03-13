package com.example.dao;

import com.example.domain.TbFoundNotice;

import java.util.List;

public interface FoundNoticeMapper {
    void addFoundNotice(TbFoundNotice tbFoundNotice);
    List<TbFoundNotice> findAll();

    void removeFoundNotice(String found_id);
}
