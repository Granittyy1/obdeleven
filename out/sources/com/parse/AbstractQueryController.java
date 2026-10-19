package com.parse;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.List;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractQueryController implements ParseQueryController {
    @Override // com.parse.ParseQueryController
    public <T extends ParseObject> Task<T> getFirstAsync(ParseQuery.State<T> state, ParseUser parseUser, Task<Void> task) {
        return (Task<T>) findAsync(state, parseUser, task).continueWith(new Continuation<List<T>, T>() { // from class: com.parse.AbstractQueryController.1
            /* JADX WARN: Incorrect return type in method signature: (Lcom/parse/boltsinternal/Task<Ljava/util/List<TT;>;>;)TT; */
            @Override // com.parse.boltsinternal.Continuation
            public ParseObject then(Task task2) throws Exception {
                if (task2.isFaulted()) {
                    throw task2.getError();
                }
                if (task2.getResult() == null || ((List) task2.getResult()).size() <= 0) {
                    throw new ParseException(R.styleable.AppCompatTheme_switchStyle, "no results found for query");
                }
                return (ParseObject) ((List) task2.getResult()).get(0);
            }
        });
    }
}
