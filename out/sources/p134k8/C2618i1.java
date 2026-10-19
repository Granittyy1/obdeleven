package p134k8;

import com.obdeleven.service.model.ControlUnit;
import com.parse.boltsinternal.Continuation;
import com.parse.boltsinternal.Task;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.R;

/* JADX INFO: renamed from: k8.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: KWP2000SubSystem22.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C2618i1 implements Continuation<Void, Task<Void>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2630m1.a f42772a;

    public C2618i1(C2630m1.a aVar) {
        this.f42772a = aVar;
    }

    @Override // com.parse.boltsinternal.Continuation
    public final Task<Void> then(Task<Void> task) throws Exception {
        C2630m1.a aVar = this.f42772a;
        ControlUnit controlUnit = C2630m1.this.f42792b;
        return controlUnit.f29335r.d(String.format(Locale.US, "22%1X6%02X", Integer.valueOf(aVar.f42800a), Integer.valueOf(aVar.f42801b + R.styleable.AppCompatTheme_toolbarNavigationButtonStyle))).continueWith(new C2615h1(this));
    }
}
