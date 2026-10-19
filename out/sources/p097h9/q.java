package p097h9;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.ui.activity.MainActivity;
import com.voltasit.obdeleven.ui.dialogs.C2134a0;
import java.io.File;
import p220r9.P;
import p220r9.y;

/* JADX INFO: compiled from: ManualEditorFragment.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements y.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f36225a;

    public q(r rVar) {
        this.f36225a = rVar;
    }

    @Override // r9.y.a
    public final void a() {
        C2134a0.a();
        MainActivity mainActivityQ = this.f36225a.q();
        P.a(mainActivityQ, mainActivityQ.getString(R.string.common_something_went_wrong));
    }

    @Override // r9.y.a
    public final void b(File file) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
        r rVar = this.f36225a;
        rVar.f36235u = bitmapDecodeFile;
        rVar.f36226l.setImageBitmap(bitmapDecodeFile);
        rVar.f36234t = true;
        C2134a0.a();
    }
}
