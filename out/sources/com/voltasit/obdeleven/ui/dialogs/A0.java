package com.voltasit.obdeleven.ui.dialogs;

import android.widget.TextView;
import com.parse.ControlUnitDB;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.utils.UserTrackingUtils;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: SecurityAccessDialogFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ B0 f33731a;

    public A0(B0 b10) {
        this.f33731a = b10;
    }

    public final void a(int i10, int i11) {
        B0 b10 = this.f33731a;
        ControlUnitDB controlUnitDB = b10.f33753w.f29320b;
        controlUnitDB.setScannedLogins(i10);
        controlUnitDB.saveEventuallyWithLogging();
        b10.f33751u.v(Boolean.TRUE);
        b10.B(i11);
        b10.f33751u.f1684D.setKeepScreenOn(false);
    }

    public final void b(int i10, int i11, long j, boolean z10) {
        B0 b10 = this.f33731a;
        TextView textView = b10.f33751u.f1683C;
        Locale locale = Locale.US;
        textView.setText(String.format(locale, "%s %05d", b10.f33750t.getString(R.string.common_scanning), Integer.valueOf(i10)));
        if (z10) {
            UserTrackingUtils.c(UserTrackingUtils.Key.f34262f, 1);
            List list = b10.f33753w.f29320b.getList("securityAccess");
            if (list != null) {
                b10.f33749s.clear();
                b10.f33749s.addAll(list);
            }
        }
        long j10 = (((long) (65536 - i11)) * j) / 1000;
        b10.f33751u.f1682B.setText(j10 == 0 ? O.a.f(b10.f33750t.getString(R.string.dialog_security_access_time_remain), " ", b10.f33750t.getString(R.string.common_calculating)) : String.format(locale, "%s %02d:%02d:%02d", b10.f33750t.getString(R.string.dialog_security_access_time_remain), Long.valueOf(j10 / 3600), Long.valueOf((j10 / 60) % 60), Long.valueOf(j10 % 60)));
        b10.f33751u.f1681A.setProgress(i11);
    }
}
