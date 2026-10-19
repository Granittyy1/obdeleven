package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: AlertController.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AlertController f8365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f8366c;

    public c(AlertController.b bVar, AlertController alertController) {
        this.f8366c = bVar;
        this.f8365b = alertController;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j) {
        AlertController.b bVar = this.f8366c;
        DialogInterface.OnClickListener onClickListener = bVar.f8353w;
        AlertController alertController = this.f8365b;
        onClickListener.onClick(alertController.f8292b, i10);
        if (bVar.f8325G) {
            return;
        }
        alertController.f8292b.dismiss();
    }
}
