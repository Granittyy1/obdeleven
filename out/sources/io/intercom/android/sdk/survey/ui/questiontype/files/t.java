package io.intercom.android.sdk.survey.ui.questiontype.files;

import kotlin.text.Regex;
import kotlin.text.RegexOption;
import p141l2.z;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t implements Ia.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f39746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f39747c;

    public /* synthetic */ t(int i10, Object obj) {
        this.f39746b = i10;
        this.f39747c = obj;
    }

    @Override // Ia.a
    public final Object invoke() {
        Object obj = this.f39747c;
        switch (this.f39746b) {
            case 0:
                return FileUploadErrorComponentKt.ActionRow_FHprtrg$lambda$3$lambda$2((Ia.a) obj);
            default:
                String str = ((z) obj).f44329c;
                if (str == null) {
                    return null;
                }
                RegexOption regexOption = RegexOption.IGNORE_CASE;
                return new Regex(str, 0);
        }
    }
}
