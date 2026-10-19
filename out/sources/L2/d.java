package L2;

import K2.x;
import androidx.fragment.app.DefaultSpecialEffectsController;
import androidx.fragment.app.SpecialEffectsController;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4459d;

    public /* synthetic */ d(Object obj, int i10, Object obj2) {
        this.f4457b = i10;
        this.f4458c = obj;
        this.f4459d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4457b) {
            case 0:
                e this$0 = (e) this.f4458c;
                i.e(this$0, "this$0");
                this$0.f4461b.a((x) this.f4459d, 3);
                break;
            default:
                DefaultSpecialEffectsController this$1 = (DefaultSpecialEffectsController) this.f4458c;
                i.e(this$1, "this$0");
                SpecialEffectsController.Operation operation = (SpecialEffectsController.Operation) this.f4459d;
                i.e(operation, "$operation");
                this$1.a(operation);
                break;
        }
    }
}
