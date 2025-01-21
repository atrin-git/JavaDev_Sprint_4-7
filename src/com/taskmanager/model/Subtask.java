package com.taskmanager.model;

/**
 * Дата-класс для подзадачи
 */
public class Subtask extends AbstractTask {
    /**
     * Идентификатор эпика, к которому привязана подзадача
     */
    private Integer epicId;

    /**
     * Конструктор копирования
     *
     * @param subtask Объект, для которого требуется создать копию
     */
    public Subtask(Subtask subtask) {
        super(subtask);
        this.epicId = subtask.getEpicId();
    }

    /**
     * Конструктор
     *
     * @param name   Наименование
     * @param epicId Идентификатор эпика для привязки
     */
    public Subtask(String name, Integer epicId) {
        super(name);
        this.epicId = epicId;
    }

    /**
     * Конструктор
     *
     * @param name        Наименование
     * @param description Описание
     * @param epicId      Идентификатор эпика для привязки
     */
    public Subtask(String name, String description, Integer epicId) {
        super(name, description);
        this.epicId = epicId;
    }

    /**
     * Конструктор
     *
     * @param id     Идентификатор
     * @param name   Наименование
     * @param epicId Идентификатор эпика для привязки
     */
    public Subtask(int id, String name, Integer epicId) {
        super(id, name);
        this.epicId = epicId;
    }

    /**
     * Конструктор
     *
     * @param id          Идентификатор
     * @param name        Наименование
     * @param description Описание
     * @param epicId      Идентификатор эпика для привязки
     */
    public Subtask(int id, String name, String description, Integer epicId) {
        super(id, name, description);
        this.epicId = epicId;
    }

    public Integer getEpicId() {
        return epicId;
    }

    public void setEpicId(Integer epicId) {
        this.epicId = epicId;
    }

    /**
     * Представление объекта подзадачи в виде строки
     *
     * @return Строка, описывающая объект подзадачи
     */
    @Override
    public String toString() {
        return String.join(",",
                /* id */            getId().toString(),
                /* type */          TaskType.SUBTASK.toString(),
                /* name */          getName(),
                /* status */        getStatus().toString(),
                /* description */   getDescription() != null ? getDescription() : "",
                /* epic */          getEpicId().toString());
    }
}
