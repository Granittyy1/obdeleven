package p134k8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: renamed from: k8.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2632n0 implements Continuation<String, Task<Integer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2635o0 f42812a;

    public C2632n0(C2635o0 c2635o0) {
        this.f42812a = c2635o0;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Integer> then(Task<String> task) throws Exception {
        String strSubstring;
        String result = task.getResult();
        if (!result.startsWith("74")) {
            return result.startsWith("7F") ? Task.forResult(Integer.valueOf(Integer.parseInt(result.substring(4), 16))) : Task.forResult(-1);
        }
        int i10 = (Integer.parseInt(result.substring(2, 4), 16) - 1) * 2;
        Task<Integer> taskForResult = Task.forResult(0);
        String str = this.f42812a.f42818c;
        while (str.length() > 0) {
            if (str.length() > i10) {
                String strSubstring2 = str.substring(0, i10);
                strSubstring = str.substring(i10);
                str = strSubstring2;
            } else {
                strSubstring = "";
            }
            taskForResult = taskForResult.continueWithTask(new C2629m0(this, str));
            str = strSubstring;
        }
        return taskForResult;
    }
}
