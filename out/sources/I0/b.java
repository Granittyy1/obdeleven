package I0;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.W;

/* JADX INFO: compiled from: CursorFilter.java */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Filter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f3779a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((W) this.f3779a).d((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Cursor cursorH;
        W w3 = (W) this.f3779a;
        if (charSequence == null) {
            string = "";
        } else {
            w3.getClass();
            string = charSequence.toString();
        }
        SearchView searchView = w3.f8861l;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorH = w3.h(w3.f8862m, string);
                if (cursorH != null) {
                    cursorH.getCount();
                } else {
                    cursorH = null;
                }
            } catch (RuntimeException unused) {
            }
        } else {
            cursorH = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorH != null) {
            filterResults.count = cursorH.getCount();
            filterResults.values = cursorH;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        a aVar = this.f3779a;
        Cursor cursor = aVar.f3772d;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((W) aVar).c((Cursor) obj);
    }
}
