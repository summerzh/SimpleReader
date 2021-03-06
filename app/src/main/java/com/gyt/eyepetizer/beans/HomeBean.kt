package com.gyt.eyepetizer.beans

data class HomeBean(
        val adExist: Boolean,
        val count: Int,
        val itemList: ArrayList<Item>,
        val nextPageUrl: String,
        val total: Int
) {
    data class Item(
            val adIndex: Int,
            val `data`: Data,
            val id: Int,
            val tag: Any,
            val type: String
    ) {
        data class Data(
                val content: Content,
                val header: Header,
                var text: String,
                var itemList: ArrayList<DataItem>,
                val icon: String,
                val iconType: String,
                val actionUrl: String,
                val ad: Boolean,
                val adTrack: Any,
                val author: Author,
                val campaign: Any,
                val category: String,
                val collected: Boolean,
                val consumption: Consumption,
                val cover: Cover,
                val dataType: String,
                val date: Long,
                val description: String,
                val descriptionEditor: String,
                val descriptionPgc: Any,
                val duration: Int,
                val favoriteAdTrack: Any,
                val id: Int,
                val idx: Int,
                val ifLimitVideo: Boolean,
                val label: Any,
                val labelList: List<Any>,
                val lastViewTime: Any,
                val library: String,
                val playInfo: List<PlayInfo>,
                val playUrl: String,
                val played: Boolean,
                val playlists: Any,
                val promotion: Any,
                val provider: Provider,
                val releaseTime: Long,
                val remark: Any,
                val resourceType: String,
                val searchWeight: Int,
                val shareAdTrack: Any,
                val slogan: String,
                val src: Any,
                val subtitles: List<Any>,
                val tags: List<Tag>,
                val thumbPlayUrl: Any,
                val title: String,
                val titlePgc: Any,
                val type: String,
                val waterMarks: Any,
                val webAdTrack: Any,
                val webUrl: WebUrl
        ) {
            data class Header(
                    val actionUrl: String,
                    val cover: Any,
                    val description: String,
                    val font: Any,
                    val icon: String,
                    val iconType: String,
                    val id: Int,
                    val label: Any,
                    val labelList: Any,
                    val rightText: Any,
                    val showHateVideo: Boolean,
                    val subTitle: Any,
                    val subTitleFont: Any,
                    val textAlign: String,
                    val time: Long,
                    val title: String
            )

            data class Content(
                    val adIndex: Int,
                    val `data`: Data,
                    val id: Int,
                    val tag: Any,
                    val type: String
            ) {
                data class Data(
                        val ad: Boolean,
                        val adTrack: Any,
                        val author: Author,
                        val campaign: Any,
                        val category: String,
                        val collected: Boolean,
                        val consumption: Consumption,
                        val cover: Cover,
                        val dataType: String,
                        val date: Long,
                        val description: String,
                        val descriptionEditor: String,
                        val descriptionPgc: Any,
                        val duration: Int,
                        val favoriteAdTrack: Any,
                        val id: Int,
                        val idx: Int,
                        val ifLimitVideo: Boolean,
                        val label: Any,
                        val labelList: List<Any>,
                        val lastViewTime: Any,
                        val library: String,
                        val playInfo: List<PlayInfo>,
                        val playUrl: String,
                        val played: Boolean,
                        val playlists: Any,
                        val promotion: Any,
                        val provider: Provider,
                        val releaseTime: Long,
                        val remark: Any,
                        val resourceType: String,
                        val searchWeight: Int,
                        val shareAdTrack: Any,
                        val slogan: String,
                        val src: Any,
                        val subtitles: List<Any>,
                        val tags: List<Tag>,
                        val thumbPlayUrl: Any,
                        val title: String,
                        val titlePgc: Any,
                        val type: String,
                        val waterMarks: Any,
                        val webAdTrack: Any,
                        val webUrl: WebUrl
                ) {
                    data class Consumption(
                            val collectionCount: Int,
                            val replyCount: Int,
                            val shareCount: Int
                    )

                    data class Cover(
                            val blurred: String,
                            val detail: String,
                            val feed: String,
                            val homepage: String,
                            val sharing: Any
                    )

                    data class PlayInfo(
                            val height: Int,
                            val name: String,
                            val type: String,
                            val url: String,
                            val urlList: List<Url>,
                            val width: Int
                    ) {
                        data class Url(
                                val name: String,
                                val size: Int,
                                val url: String
                        )
                    }

                    data class Author(
                            val adTrack: Any,
                            val approvedNotReadyVideoCount: Int,
                            val description: String,
                            val expert: Boolean,
                            val follow: Follow,
                            val icon: String,
                            val id: Int,
                            val ifPgc: Boolean,
                            val latestReleaseTime: Long,
                            val link: String,
                            val name: String,
                            val recSort: Int,
                            val shield: Shield,
                            val videoNum: Int
                    ) {
                        data class Follow(
                                val followed: Boolean,
                                val itemId: Int,
                                val itemType: String
                        )

                        data class Shield(
                                val itemId: Int,
                                val itemType: String,
                                val shielded: Boolean
                        )
                    }

                    data class Tag(
                            val actionUrl: String,
                            val adTrack: Any,
                            val bgPicture: String,
                            val childTagIdList: Any,
                            val childTagList: Any,
                            val communityIndex: Int,
                            val desc: String,
                            val headerImage: String,
                            val id: Int,
                            val name: String,
                            val tagRecType: String
                    )

                    data class WebUrl(
                            val forWeibo: String,
                            val raw: String
                    )

                    data class Provider(
                            val alias: String,
                            val icon: String,
                            val name: String
                    )
                }
            }

            data class DataItem(
                    val adIndex: Int,
                    val `data`: DataItem.Data,
                    val id: Int,
                    val tag: Any,
                    val type: String
            ) {
                data class Data(
                        val actionUrl: String,
                        val adTrack: Any,
                        val autoPlay: Boolean,
                        val dataType: String,
                        val description: String,
                        val header: Header,
                        val id: Int,
                        val image: String,
                        val label: Label,
                        val labelList: List<Any>,
                        val shade: Boolean,
                        val title: String
                ) {
                    data class Label(
                            val card: String,
                            val detail: Any,
                            val text: String
                    )

                    data class Header(
                            val actionUrl: Any,
                            val cover: Any,
                            val description: Any,
                            val font: Any,
                            val icon: Any,
                            val id: Int,
                            val label: Any,
                            val labelList: Any,
                            val rightText: Any,
                            val subTitle: Any,
                            val subTitleFont: Any,
                            val textAlign: String,
                            val title: Any
                    )
                }
            }

            data class Consumption(
                    val collectionCount: Int,
                    val replyCount: Int,
                    val shareCount: Int
            )

            data class Cover(
                    val blurred: String,
                    val detail: String,
                    val feed: String,
                    val homepage: String,
                    val sharing: Any
            )

            data class PlayInfo(
                    val height: Int,
                    val name: String,
                    val type: String,
                    val url: String,
                    val urlList: List<Url>,
                    val width: Int
            ) {
                data class Url(
                        val name: String,
                        val size: Int,
                        val url: String
                )
            }

            data class Author(
                    val adTrack: Any,
                    val approvedNotReadyVideoCount: Int,
                    val description: String,
                    val expert: Boolean,
                    val follow: Follow,
                    val icon: String,
                    val id: Int,
                    val ifPgc: Boolean,
                    val latestReleaseTime: Long,
                    val link: String,
                    val name: String,
                    val recSort: Int,
                    val shield: Shield,
                    val videoNum: Int
            ) {
                data class Follow(
                        val followed: Boolean,
                        val itemId: Int,
                        val itemType: String
                )

                data class Shield(
                        val itemId: Int,
                        val itemType: String,
                        val shielded: Boolean
                )
            }

            data class Tag(
                    val actionUrl: String,
                    val adTrack: Any,
                    val bgPicture: String,
                    val childTagIdList: Any,
                    val childTagList: Any,
                    val communityIndex: Int,
                    val desc: String,
                    val headerImage: String,
                    val id: Int,
                    val name: String,
                    val tagRecType: String
            )

            data class WebUrl(
                    val forWeibo: String,
                    val raw: String
            )

            data class Provider(
                    val alias: String,
                    val icon: String,
                    val name: String
            )

        }
    }
}