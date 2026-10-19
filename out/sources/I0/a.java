package I0;

import J4.i;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import androidx.appcompat.widget.W;

/* JADX INFO: compiled from: CursorAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cursor f3772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0047a f3774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f3775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I0.b f3776h;

    /* JADX INFO: renamed from: I0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CursorAdapter.java */
    public class C0047a extends ContentObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ W f3777a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0047a(W w3) {
            super(new Handler());
            this.f3777a = w3;
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            Cursor cursor;
            W w3 = this.f3777a;
            if (!w3.f3771c || (cursor = w3.f3772d) == null || cursor.isClosed()) {
                return;
            }
            w3.f3770b = w3.f3772d.requery();
        }
    }

    /* JADX INFO: compiled from: CursorAdapter.java */
    public class b extends DataSetObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ W f3778a;

        public b(W w3) {
            this.f3778a = w3;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            W w3 = this.f3778a;
            w3.f3770b = true;
            w3.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            W w3 = this.f3778a;
            w3.f3770b = false;
            w3.notifyDataSetInvalidated();
        }
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.f3772d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                C0047a c0047a = this.f3774f;
                if (c0047a != null) {
                    cursor2.unregisterContentObserver(c0047a);
                }
                b bVar = this.f3775g;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f3772d = cursor;
            if (cursor != null) {
                C0047a c0047a2 = this.f3774f;
                if (c0047a2 != null) {
                    cursor.registerContentObserver(c0047a2);
                }
                b bVar2 = this.f3775g;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f3773e = cursor.getColumnIndexOrThrow("_id");
                this.f3770b = true;
                notifyDataSetChanged();
            } else {
                this.f3773e = -1;
                this.f3770b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f3770b || (cursor = this.f3772d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f3770b) {
            return null;
        }
        this.f3772d.moveToPosition(i10);
        if (view == null) {
            c cVar = (c) this;
            view = cVar.f3781k.inflate(cVar.j, viewGroup, false);
        }
        b(view, this.f3772d);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f3776h == null) {
            I0.b bVar = new I0.b();
            bVar.f3779a = this;
            this.f3776h = bVar;
        }
        return this.f3776h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f3770b || (cursor = this.f3772d) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f3772d;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (this.f3770b && (cursor = this.f3772d) != null && cursor.moveToPosition(i10)) {
            return this.f3772d.getLong(this.f3773e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f3770b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f3772d.moveToPosition(i10)) {
            throw new IllegalStateException(i.b(i10, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = e(viewGroup);
        }
        b(view, this.f3772d);
        return view;
    }
}
