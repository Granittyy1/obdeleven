package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: AlertController.java */
/* JADX INFO: loaded from: classes.dex */
public final class d implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f8367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController f8368c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f8369d;

    public d(AlertController.b bVar, AlertController.RecycleListView recycleListView, AlertController alertController) {
        this.f8369d = bVar;
        this.f8367b = recycleListView;
        this.f8368c = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        AlertController.b bVar = this.f8369d;
        boolean[] zArr = bVar.f8323E;
        AlertController.RecycleListView recycleListView = this.f8367b;
        if (zArr != null) {
            zArr[i10] = recycleListView.isItemChecked(i10);
        }
        bVar.f8327I.onClick(this.f8368c.f8292b, i10, recycleListView.isItemChecked(i10));
    }
}
