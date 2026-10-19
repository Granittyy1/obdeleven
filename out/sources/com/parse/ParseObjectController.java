package com.parse;

import com.parse.boltsinternal.Task;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
interface ParseObjectController {
    Task<Void> deleteAsync(ParseObject.State state, String str);

    Task<ParseObject.State> fetchAsync(ParseObject.State state, String str, ParseDecoder parseDecoder);

    List<Task<ParseObject.State>> saveAllAsync(List<ParseObject.State> list, List<ParseOperationSet> list2, String str, List<ParseDecoder> list3);

    Task<ParseObject.State> saveAsync(ParseObject.State state, ParseOperationSet parseOperationSet, String str, ParseDecoder parseDecoder);
}
