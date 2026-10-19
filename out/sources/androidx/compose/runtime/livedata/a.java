package androidx.compose.runtime.livedata;

import androidx.compose.runtime.X;
import androidx.lifecycle.D;
import com.voltasit.obdeleven.presentation.settings.SettingsFragment;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f13076c;

    public /* synthetic */ a(int i10, Object obj) {
        this.f13075b = i10;
        this.f13076c = obj;
    }

    @Override // androidx.lifecycle.D
    public final void d(Object obj) {
        switch (this.f13075b) {
            case 0:
                ((X) this.f13076c).setValue(obj);
                break;
            default:
                SettingsFragment this$0 = (SettingsFragment) this.f13076c;
                i.e(this$0, "this$0");
                this$0.q().F();
                break;
        }
    }
}
