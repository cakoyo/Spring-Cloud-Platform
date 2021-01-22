package moe.kira.common.message.data;

import java.util.Collections;
import java.util.List;

import lombok.Data;

@Data
public class TableData<T> {
    public static <T> TableData<T> emptyData() {
        return new TableData<T>(0, Collections.emptyList());
    }
    
    private final long total;
    private final List<T> rows;
}