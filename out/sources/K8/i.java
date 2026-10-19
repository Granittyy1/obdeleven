package K8;

import G8.C0707i;
import com.voltasit.obdeleven.domain.models.Screen;

/* JADX INFO: compiled from: NavigationProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
public interface i {

    /* JADX INFO: compiled from: NavigationProvider.kt */
    public static final class a {
        public static /* synthetic */ void a(i iVar, Screen screen, int i10) {
            if ((i10 & 1) != 0) {
                screen = Screen.None;
            }
            iVar.b(screen, false);
        }
    }

    void a(C0707i c0707i);

    void b(Screen screen, boolean z10);

    kotlinx.coroutines.flow.r c();
}
