package X5;

import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.J;

/* JADX INFO: compiled from: MaterialAutoCompleteTextView.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f7312b;

    public w(x xVar) {
        this.f7312b = xVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        Object item;
        x xVar = this.f7312b;
        if (i10 < 0) {
            J j10 = xVar.f7313f;
            item = !j10.f8721A.isShowing() ? null : j10.f8724d.getSelectedItem();
        } else {
            item = xVar.getAdapter().getItem(i10);
        }
        x.a(xVar, item);
        AdapterView.OnItemClickListener onItemClickListener = xVar.getOnItemClickListener();
        J j11 = xVar.f7313f;
        if (onItemClickListener != null) {
            if (view == null || i10 < 0) {
                view = j11.f8721A.isShowing() ? j11.f8724d.getSelectedView() : null;
                i10 = !j11.f8721A.isShowing() ? -1 : j11.f8724d.getSelectedItemPosition();
                j = !j11.f8721A.isShowing() ? Long.MIN_VALUE : j11.f8724d.getSelectedItemId();
            }
            onItemClickListener.onItemClick(j11.f8724d, view, i10, j);
        }
        j11.dismiss();
    }
}
