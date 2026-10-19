package F0;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.appcompat.widget.C0857j;
import androidx.core.view.C1291f;
import androidx.core.view.O;

/* JADX INFO: compiled from: InputConnectionCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f3182a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InputConnection inputConnection, b bVar) {
        super(inputConnection, false);
        this.f3182a = bVar;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        Bundle bundle2;
        C1291f.b aVar;
        d dVar = inputContentInfo == null ? null : new d(new d.a(inputContentInfo));
        b bVar = this.f3182a;
        if ((i10 & 1) != 0) {
            try {
                dVar.f3183a.f3184a.requestPermission();
                InputContentInfo inputContentInfo2 = dVar.f3183a.f3184a;
                bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle2.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo2);
            } catch (Exception unused) {
            }
        } else {
            bundle2 = bundle;
        }
        ClipDescription description = dVar.f3183a.f3184a.getDescription();
        d.a aVar2 = dVar.f3183a;
        ClipData clipData = new ClipData(description, new ClipData.Item(aVar2.f3184a.getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            aVar = new C1291f.a(clipData, 2);
        } else {
            C1291f.c cVar = new C1291f.c();
            cVar.f16921a = clipData;
            cVar.f16922b = 2;
            aVar = cVar;
        }
        aVar.b(aVar2.f3184a.getLinkUri());
        aVar.setExtras(bundle2);
        if (O.j((C0857j) bVar.f3181b, aVar.a()) == null) {
            return true;
        }
        return super.commitContent(inputContentInfo, i10, bundle);
    }
}
