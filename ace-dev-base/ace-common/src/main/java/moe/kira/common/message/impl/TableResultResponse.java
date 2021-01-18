package moe.kira.common.message.impl;

import java.util.List;

import moe.kira.common.message.ResultResponse;
import moe.kira.common.message.data.TableData;
import moe.kira.common.message.impl.base.BasicRestResponse;

/**
 * ${DESCRIPTION}
 *
 * @author the sun
 * @create 2017-06-14 22:40
 */
public class TableResultResponse<T> extends BasicRestResponse<TableData<T>> implements ResultResponse<T> {
    public TableResultResponse(int total, List<T> rows) {
        super(new TableData<T>(total, rows));
    }

    public TableResultResponse() {
        super(TableData.emptyData());
    }
}
