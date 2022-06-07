package me.gogosing.board.adapter.out.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 게시물 첨부파일 Entity.
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "board_attachment")
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = false)
public class BoardAttachmentEntity extends BaseEntity {

	/**
	 * 게시물 첨부파일 번호.
	 */
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "board_attachment_id", nullable = false)
	private Long boardAttachmentId;

	/**
	 * 게시물 일련번호.
	 */
	@Column(name = "board_id", nullable = false)
	private Long boardId;

	/**
	 * 첨부파일경로.
	 */
	@EqualsAndHashCode.Include
	@Column(name = "board_attachment_path", nullable = false)
	private String boardAttachmentPath;

	/**
	 * 첨부파일명.
	 */
	@EqualsAndHashCode.Include
	@Column(name = "board_attachment_name", nullable = false)
	private String boardAttachmentName;
}
