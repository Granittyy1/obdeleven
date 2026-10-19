package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements DynamiteModule.a {
    @Override // com.google.android.gms.dynamite.DynamiteModule.a
    public final DynamiteModule.a.b a(Context context, String str, DynamiteModule.a.InterfaceC0266a interfaceC0266a) throws DynamiteModule.LoadingException {
        int iA;
        DynamiteModule.a.b bVar = new DynamiteModule.a.b();
        int iB = interfaceC0266a.b(context, str);
        bVar.f25347a = iB;
        int i10 = 1;
        int i11 = 0;
        if (iB != 0) {
            iA = interfaceC0266a.a(context, str, false);
            bVar.f25348b = iA;
        } else {
            iA = interfaceC0266a.a(context, str, true);
            bVar.f25348b = iA;
        }
        int i12 = bVar.f25347a;
        if (i12 == 0) {
            if (iA == 0) {
                i10 = 0;
            }
            bVar.f25349c = i10;
            return bVar;
        }
        i11 = i12;
        if (i11 >= iA) {
            i10 = -1;
        }
        bVar.f25349c = i10;
        return bVar;
    }
}
