package p033c7;

import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import java.util.Comparator;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class D implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
        CampaignProto$ThickContent campaignProto$ThickContent2 = (CampaignProto$ThickContent) obj2;
        if (campaignProto$ThickContent.J() && !campaignProto$ThickContent2.J()) {
            return -1;
        }
        if (!campaignProto$ThickContent2.J() || campaignProto$ThickContent.J()) {
            return Integer.compare(campaignProto$ThickContent.L().H(), campaignProto$ThickContent2.L().H());
        }
        return 1;
    }
}
