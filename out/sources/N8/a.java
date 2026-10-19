package N8;

import B8.C0639m;
import android.widget.CompoundButton;

/* JADX INFO: compiled from: OnCheckedChangeListener.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0639m f4670b;

    public a(C0639m c0639m) {
        this.f4670b = c0639m;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        com.voltasit.obdeleven.a aVar = this.f4670b.f2000v;
        if (aVar != null) {
            aVar.j("key_ask_which_device_to_choose", z10);
        }
    }
}
