package com.example.study.model.network;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Accessors(chain = true)
public class Pagination {

    private Integer totalPages; // 총 페이지
    private Long totalElements; // 데이터의 수
    private Integer currentPage;// 현재 페이지
    private Integer currentElements; // 현재 페이지의 데이터 수
}
