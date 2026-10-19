package R0;

import B8.G0;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import com.voltasit.obdeleven.R;
import com.voltasit.obdeleven.presentation.history.HistoryAdapter;
import com.voltasit.obdeleven.presentation.history.vehicle.VehicleHistoryFragment;
import io.intercom.android.sdk.Intercom;
import java.io.InputStream;
import java.nio.MappedByteBuffer;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f5171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5172c;

    public /* synthetic */ j(int i10, Object obj) {
        this.f5171b = i10;
        this.f5172c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5171b) {
            case 0:
                androidx.emoji2.text.e.b bVar = (androidx.emoji2.text.e.b) this.f5172c;
                synchronized (bVar.f17366d) {
                    try {
                        if (bVar.f17370h == null) {
                            return;
                        }
                        try {
                            p283x0.l lVarC = bVar.c();
                            int i10 = lVarC.f47873e;
                            if (i10 == 2) {
                                synchronized (bVar.f17366d) {
                                }
                            }
                            if (i10 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i10 + ")");
                            }
                            try {
                                int i11 = p271w0.j.f47686a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                androidx.emoji2.text.e.a aVar = bVar.f17365c;
                                Context context = bVar.f17363a;
                                aVar.getClass();
                                Typeface typefaceB = p222s0.e.f46858a.b(context, new p283x0.l[]{lVarC}, 0);
                                MappedByteBuffer mappedByteBufferE = p222s0.l.e(bVar.f17363a, lVarC.f47869a);
                                if (mappedByteBufferE == null || typefaceB == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    l lVar = new l(typefaceB, k.a(mappedByteBufferE));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (bVar.f17366d) {
                                        try {
                                            androidx.emoji2.text.c.h hVar = bVar.f17370h;
                                            if (hVar != null) {
                                                hVar.b(lVar);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    bVar.b();
                                    return;
                                } catch (Throwable th2) {
                                    int i12 = p271w0.j.f47686a;
                                    Trace.endSection();
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                int i13 = p271w0.j.f47686a;
                                Trace.endSection();
                                throw th3;
                            }
                            break;
                        } catch (Throwable th4) {
                            synchronized (bVar.f17366d) {
                                try {
                                    androidx.emoji2.text.c.h hVar2 = bVar.f17370h;
                                    if (hVar2 != null) {
                                        hVar2.a(th4);
                                    }
                                    bVar.b();
                                    return;
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            case 1:
                VehicleHistoryFragment this$0 = (VehicleHistoryFragment) this.f5172c;
                kotlin.jvm.internal.i.e(this$0, "this$0");
                HistoryAdapter historyAdapter = this$0.f32475l;
                kotlin.jvm.internal.i.b(historyAdapter);
                historyAdapter.f32398m.clear();
                historyAdapter.d();
                historyAdapter.notifyDataSetChanged();
                com.voltasit.obdeleven.presentation.history.vehicle.k kVar = this$0.f32478o;
                kotlin.jvm.internal.i.b(kVar);
                kVar.f46416a = 0;
                kVar.f46417b = 0;
                kVar.f46418c = true;
                this$0.f32483t = false;
                this$0.R(0);
                HistoryAdapter historyAdapter2 = this$0.f32475l;
                kotlin.jvm.internal.i.b(historyAdapter2);
                if (!historyAdapter2.f32398m.isEmpty()) {
                    G0 g10 = this$0.f32481r;
                    if (g10 == null) {
                        kotlin.jvm.internal.i.m("binding");
                        throw null;
                    }
                    g10.f1678u.setVisibility(0);
                    G0 g11 = this$0.f32481r;
                    if (g11 != null) {
                        g11.f1675r.setVisibility(8);
                        return;
                    } else {
                        kotlin.jvm.internal.i.m("binding");
                        throw null;
                    }
                }
                G0 g12 = this$0.f32481r;
                if (g12 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                g12.f1678u.setVisibility(8);
                G0 g13 = this$0.f32481r;
                if (g13 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                g13.f1675r.setVisibility(0);
                G0 g14 = this$0.f32481r;
                if (g14 == null) {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
                g14.f1675r.setText(R.string.view_history_filter_no_results);
                G0 g15 = this$0.f32481r;
                if (g15 != null) {
                    g15.f1675r.setClickable(false);
                    return;
                } else {
                    kotlin.jvm.internal.i.m("binding");
                    throw null;
                }
            case 2:
                p214r3.g.b((InputStream) this.f5172c);
                return;
            default:
                Intercom.softRegister$lambda$2((Intercom) this.f5172c);
                return;
        }
    }
}
