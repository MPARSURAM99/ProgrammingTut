export const home = (req, res) => {
    res.status(200).json({
        success: true,
        message: "Hye from Home",
        data: null
    });
}