package io.intercom.android.sdk.m5.home.data;

import Ba.a;
import io.intercom.android.sdk.R;
import kotlin.jvm.internal.e;

/* JADX INFO: compiled from: HomeV2Response.kt */
/* JADX INFO: loaded from: classes3.dex */
public enum IconType {
    TEAMMATE { // from class: io.intercom.android.sdk.m5.home.data.IconType.TEAMMATE
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_send_message_icon);
        }
    },
    BOT { // from class: io.intercom.android.sdk.m5.home.data.IconType.BOT
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_conversation_card_question);
        }
    },
    FIN { // from class: io.intercom.android.sdk.m5.home.data.IconType.FIN
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        public Integer getIcon() {
            return Integer.valueOf(R.drawable.intercom_chevron);
        }
    },
    FACE_PILE { // from class: io.intercom.android.sdk.m5.home.data.IconType.FACE_PILE
        @Override // io.intercom.android.sdk.m5.home.data.IconType
        public Integer getIcon() {
            return null;
        }
    };

    private static final /* synthetic */ a $ENTRIES = kotlin.enums.a.a(values());

    /* synthetic */ IconType(e eVar) {
        this();
    }

    public static a<IconType> getEntries() {
        return $ENTRIES;
    }

    public abstract Integer getIcon();
}
