package N0;

import B8.C0640m0;
import M0.f;
import N8.e;
import android.text.Editable;
import android.text.TextWatcher;
import com.voltasit.obdeleven.presentation.settings.SettingsViewModel;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: TextViewBindingAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class b implements TextWatcher {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f4622c;

    public b(e eVar, f fVar) {
        this.f4621b = eVar;
        this.f4622c = fVar;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence s10, int i10, int i11, int i12) {
        SettingsViewModel settingsViewModel;
        e eVar = this.f4621b;
        if (eVar != null) {
            C0640m0 c0640m0 = eVar.f4675a;
            int i13 = eVar.f4676b;
            if (i13 == 19) {
                SettingsViewModel settingsViewModel2 = c0640m0.f2028b0;
                if (settingsViewModel2 != null) {
                    i.e(s10, "s");
                    settingsViewModel2.f33145a1 = s10.toString();
                }
            } else if (i13 == 21 && (settingsViewModel = c0640m0.f2028b0) != null) {
                i.e(s10, "s");
                settingsViewModel.f33147b1 = s10.toString();
            }
        }
        f fVar = this.f4622c;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
