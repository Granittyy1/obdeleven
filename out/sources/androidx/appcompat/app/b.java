package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.database.Cursor;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

/* JADX INFO: compiled from: AlertController.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends CursorAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8361c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AlertController.RecycleListView f8362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AlertController f8363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AlertController.b f8364f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AlertController.b bVar, ContextThemeWrapper contextThemeWrapper, Cursor cursor, AlertController.RecycleListView recycleListView, AlertController alertController) {
        super((Context) contextThemeWrapper, cursor, false);
        this.f8364f = bVar;
        this.f8362d = recycleListView;
        this.f8363e = alertController;
        Cursor cursor2 = getCursor();
        this.f8360b = cursor2.getColumnIndexOrThrow(bVar.f8329K);
        this.f8361c = cursor2.getColumnIndexOrThrow(bVar.f8330L);
    }

    @Override // android.widget.CursorAdapter
    public final void bindView(View view, Context context, Cursor cursor) {
        ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f8360b));
        this.f8362d.setItemChecked(cursor.getPosition(), cursor.getInt(this.f8361c) == 1);
    }

    @Override // android.widget.CursorAdapter
    public final View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f8364f.f8333b.inflate(this.f8363e.f8285L, viewGroup, false);
    }
}
