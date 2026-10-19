package T4;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 extends Fragment implements InterfaceC0773f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final WeakHashMap f6020c = new WeakHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0 f6021b = new x0();

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f6021b.f6015a.values().iterator();
        while (it.hasNext()) {
            ((C0772e) it.next()).getClass();
        }
    }

    @Override // T4.InterfaceC0773f
    public final void k(String str, C0772e c0772e) {
        x0 x0Var = this.f6021b;
        Map map = x0Var.f6015a;
        if (map.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(str.length() + 59);
            sb2.append("LifecycleCallback with tag ");
            sb2.append(str);
            sb2.append(" already added to this fragment.");
            throw new IllegalArgumentException(sb2.toString());
        }
        map.put(str, c0772e);
        if (x0Var.f6016b > 0) {
            new com.google.android.gms.internal.common.f(Looper.getMainLooper()).post(new w0(x0Var, c0772e, str));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Iterator it = this.f6021b.f6015a.values().iterator();
        while (it.hasNext()) {
            ((C0772e) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x0 x0Var = this.f6021b;
        x0Var.f6016b = 1;
        x0Var.f6017c = bundle;
        for (Map.Entry entry : x0Var.f6015a.entrySet()) {
            ((C0772e) entry.getValue()).d(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        x0 x0Var = this.f6021b;
        x0Var.f6016b = 5;
        Iterator it = x0Var.f6015a.values().iterator();
        while (it.hasNext()) {
            ((C0772e) it.next()).getClass();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        x0 x0Var = this.f6021b;
        x0Var.f6016b = 3;
        Iterator it = x0Var.f6015a.values().iterator();
        while (it.hasNext()) {
            ((C0772e) it.next()).e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        x0 x0Var = this.f6021b;
        if (bundle == null) {
            x0Var.getClass();
            return;
        }
        for (Map.Entry entry : x0Var.f6015a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((C0772e) entry.getValue()).getClass();
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        x0 x0Var = this.f6021b;
        x0Var.f6016b = 2;
        Iterator it = x0Var.f6015a.values().iterator();
        while (it.hasNext()) {
            ((C0772e) it.next()).g();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        x0 x0Var = this.f6021b;
        x0Var.f6016b = 4;
        Iterator it = x0Var.f6015a.values().iterator();
        while (it.hasNext()) {
            ((C0772e) it.next()).h();
        }
    }
}
