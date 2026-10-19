package com.voltasit.obdeleven.presentation.dialogs.backup;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: MultiBackupDialog.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements O8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiBackupDialog f32186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f32187b;

    public e(MultiBackupDialog multiBackupDialog, String str) {
        this.f32186a = multiBackupDialog;
        this.f32187b = str;
    }

    @Override // O8.a
    public final void a(double d10) {
        MultiBackupDialog multiBackupDialog = this.f32186a;
        if (multiBackupDialog.isAdded()) {
            multiBackupDialog.f33984s.f2112C.setText(String.format(Locale.US, "%d %%", Arrays.copyOf(new Object[]{Integer.valueOf((int) Math.round(d10))}, 1)));
            multiBackupDialog.f33984s.f2113D.setProgress((int) Math.round(d10));
        }
    }

    @Override // O8.a
    public final void b(float f10) {
        this.f32186a.C(f10);
    }

    public final void c() {
        MultiBackupDialog multiBackupDialog = this.f32186a;
        MultiBackupDialog.a aVar = multiBackupDialog.f32174D;
        if (aVar != null) {
            i.b(aVar);
            aVar.onFailure();
        }
        if (multiBackupDialog.isAdded()) {
            multiBackupDialog.y();
        }
    }
}
