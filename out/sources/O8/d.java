package O8;

import androidx.appcompat.widget.SearchView;

/* JADX INFO: compiled from: SearchOnTextSubmit.java */
/* JADX INFO: loaded from: classes3.dex */
public interface d extends SearchView.k {
    @Override // androidx.appcompat.widget.SearchView.k
    default boolean b(String str) {
        return false;
    }
}
