package p134k8;

import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;

/* JADX INFO: compiled from: ControlUnit.java */
/* JADX INFO: loaded from: classes3.dex */
public final class G0 implements Continuation<String, Task<Integer>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H0 f42593a;

    public G0(H0 h8) {
        this.f42593a = h8;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Integer> then(Task<String> task) throws Exception {
        String strSubstring;
        String result = task.getResult();
        if (!result.startsWith("74")) {
            return result.startsWith("7F") ? Task.forResult(Integer.valueOf(Integer.parseInt(result.substring(4), 16))) : Task.forResult(-1);
        }
        int i10 = (Integer.parseInt(result.substring(4, (((Integer.parseInt(result.substring(2, 4), 16) >> 4) & 15) * 2) + 4), 16) - 2) * 2;
        Task<Integer> taskForResult = Task.forResult(0);
        String str = this.f42593a.f42599c;
        while (str.length() > 0) {
            if (str.length() > i10) {
                String strSubstring2 = str.substring(0, i10);
                strSubstring = str.substring(i10);
                str = strSubstring2;
            } else {
                strSubstring = "";
            }
            taskForResult = taskForResult.continueWithTask(new C2593a0(this, str, 1));
            str = strSubstring;
        }
        return taskForResult;
    }
}
